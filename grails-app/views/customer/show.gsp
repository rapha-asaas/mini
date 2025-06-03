<!DOCTYPE html>
<html>
<head>
    <title>Show</title>
</head>
<body>

    <p>Aqui as informações do cliente:</p>
    <p>Nome: ${customer.name}</p>
    <p>Email: ${customer.email}</p>
    <p>DateCreated: ${customer.dateCreated}</p>

    <%-- <form class="form" action="${createLink(controller: "customer", action: "save")}" id="form">
        <input type="text" name="name" placeholder="Name"/>
        <input type="email" name="email" placeholder="Email"/>
        <input type="submit" value="Submit"/>
    </form> --%>
</body>
</html>