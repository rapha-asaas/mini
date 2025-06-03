<!DOCTYPE html>
<html>
<head>
    <title>Payer List</title>
</head>
<body>
    <form class="form" action="${createLink(controller: "payer", action: "save")}" id="form">
        <input type="text" name="name" placeholder="Name"/>
        <input type="email" name="email" placeholder="Email"/>
        <input type="submit" value="Submit"/>
    </form>
</body>
</html>