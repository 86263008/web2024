javac -encoding utf-8 StudentDao.java -d .
javac -encoding utf-8 StudentDaoTest.java -d .
java -classpath ".;sqlite-jdbc-3.41.0.0.jar" xust.stu.demo.StudentDaoTest

