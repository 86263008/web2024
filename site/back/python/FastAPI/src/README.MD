[toc]

# 程序运行流程

## 技术栈

|技术| 作用|
|----|----|
|FastApi|Restful Api框架|
|uvicorn|ASGI服务器|
|venv|虚拟环境|

## 过程

1. 使用**venv**创建虚拟环境`.venv`

```shell
cd 11 # 进入应用所在目录
py -m venv .venv
```

2. 激活虚拟环境：

```shell
.venv\scripts\activate
```

3. 安装依赖包：

```shell
pip install fastapi
pip install "uvicorn[standard]"
或
pip install -r requirements.txt
```

4. 运行程序，如：

```shell
cd 01
uvicorn main:app --reload
INFO:     Will watch for changes in these directories: ['D:\\WS_Edu\\web2021\\Courseware-python\\Code\\11\\01']de\\11\\01']
INFO:     Uvicorn running on http://127.0.0.1:8000 (Press CTRL+C to quit)
INFO:     Started reloader process [24352] using WatchFiles
INFO:     Started server process [17664]
INFO:     Waiting for application startup.
INFO:     Application startup complete.
INFO:     127.0.0.1:64346 - "GET / HTTP/1.1" 200 OK
INFO:     127.0.0.1:64346 - "GET /favicon.ico HTTP/1.1" 404 Not Found
INFO:     Stopping reloader process [24352]
```

5. 撤销虚拟环境：

```shell
cd..
.venv\scripts\deactivate
```