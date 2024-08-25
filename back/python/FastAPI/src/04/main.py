from fastapi import FastAPI
from pydantic import BaseModel
import uvicorn

class Item(BaseModel):
    name: str
    description: str = None
    price: float
    tax: float = None

app = FastAPI()

@app.post("/items/{item_id}")
async def create_item(
    item_id: int,
    item: Item,
    q: str = None
):
    result = {"item_id": item_id, **item.dict()}
    if q:
        result.update({"q": q})
    return result

if __name__ == "__main__":
  #启动WSGI ASGI服务器
  #DEBUG,INFO,WARNNING,ERROR,FETAL
  config = uvicorn.Config("main:app", port=8000, log_level="error", reload=False)
  server = uvicorn.Server(config)
  server.run()