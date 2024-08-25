from imp import reload
from fastapi import FastAPI
import uvicorn

app = FastAPI()

'''路由:查表
{
  "/": read_root,
  "/items/{item_id}": read_item
}
'''
@app.get("/")#路由，注记/注解 annotation，语法糖
def read_root():
  return {"Hello": "World"}#Dict,名-值(key-value)对的集合

@app.get("/items/{item_id}")#路由
def read_item(item_id: int, q: str = None):
  #类型修饰符
  return {"item_id": item_id, "q": q}

if __name__ == "__main__":
  #启动WSGI ASGI服务器
  #DEBUG,INFO,WARNNING,ERROR,FETAL
  config = uvicorn.Config("main:app", port=8000, log_level="error", reload=False)
  server = uvicorn.Server(config)
  server.run()