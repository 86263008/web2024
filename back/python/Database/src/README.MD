[toc]

# 示例运行

## 基于Docker的示例数据库建立

1. 拉取mysql镜像

```shell
docker search mysql
docker pull mysql
```

2. 建立宿主数据目录

```shell
mkdir db\conf db\logs db\data
```

3. 运行mysql容器

```shell
docker run ^
-p 3306:3306 ^
--name my-mysql ^
-v ${work_space}/db/conf:/etc/mysql/conf.d ^
-v ${work_space}/db/logs:/logs ^
-v ${work_space}/db/data:/var/lib/mysql ^
-e MYSQL_ROOT_PASSWORD=andy123456 ^
-d mysql 
```

4. 登录容器

```shell
docker exec -it my-mysql bash
```

5. 登录mysql

```shell
mysql -u root -pandy123456 --default-character-set=utf8
```

6. 查看现有数据库

```shell
show databases;
+--------------------+
| Database           |
+--------------------+
| information_schema |
| mysql              |
| performance_schema |
| sys                |
+--------------------+
4 rows in set (0.00 sec)
```

7. 创建数据库**mrsoft**

```shell
create database mysql_demo; #创建数据库
use mysql_demo; #选择数据库
```

## 运行示例

1. 创建venv虚拟环境：

```shell
python -m venv .venv
```

2. 激活虚拟环境：

```shell
.venv\scripts\activate
```

3. 安装依赖

```shell
pip install -r requirements.txt
```

4. 运行程序

```shell
python 01\run.py
```

