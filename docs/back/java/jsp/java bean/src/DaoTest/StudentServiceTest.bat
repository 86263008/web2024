del stu.db
javac -encoding utf-8 xust/stu/Result.java -d .
javac -encoding utf-8 xust/stu/ConnectionUtil.java -d .
javac -encoding utf-8 xust/stu/demo/domain/Student.java -d .
javac -encoding utf-8 xust/stu/demo/dao/StudentDao.java -d .
javac -encoding utf-8 xust/stu/demo/dao/StudentDaoImpl.java -d .
javac -encoding utf-8 xust/stu/demo/dao/StudentDaoTest.java -d .
javac -encoding utf-8 xust/stu/demo/service/StudentService.java -d .
javac -encoding utf-8 xust/stu/demo/service/StudentServiceImpl.java -d .
javac -encoding utf-8 xust/stu/demo/service/StudentServiceTest.java -d .
java -classpath ".;sqlite-jdbc-3.41.0.0.jar" xust.stu.demo.service.StudentServiceTest > StudentServiceTestResult.txt
