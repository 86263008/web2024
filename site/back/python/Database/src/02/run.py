import pymysql

# 打开数据库连接
conn = pymysql.connect(
    host = 'localhost', # 主机名
    user = 'root',      # 数据库用户名
    password = 'andy123456',  # 数据库密码
    db = 'mysql_demo',      # 数据库名
    charset = 'utf8',   # 字符集编码
    cursorclass = pymysql.cursors.DictCursor # 游标类型
)

# 使用cursor()方法获取操作游标
cursor = conn.cursor()
# 数据列表
data = [("零基础学Python",'Python','79.80','2018-5-20'),
        ("Python从入门到精通",'Python','69.80','2018-6-18'),
        ("零基础学PHP",'PHP','69.80','2017-5-21'),
        ("PHP项目开发实战入门",'PHP','79.80','2016-5-21'),
        ("零基础学Java",'Java','69.80','2017-5-21'),
        ]
try:
    # 执行sql语句，插入多条数据
    cursor.executemany("insert into books(name, category, price, publish_time) values (%s,%s,%s,%s)", data)
    #占位符
    # 提交数据
    conn.commit()
except:
    # 发生错误时回滚
    conn.rollback()

# 关闭数据库连接
conn.close()
