<!DOCTYPE html>
<html>

<head>
  <title>首页</title>
  <link rel="stylesheet" type="text/css" href="style.css">
</head>

<body>
  <!-- --8<-- [start:message] -->
  <#list messages as message>
  <h1>${message}</h1>
  </#list>
  <!-- --8<-- [end:message] -->
</body>

</html>