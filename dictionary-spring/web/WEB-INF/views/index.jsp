
<html>
<head>
    <title>Dictionary</title>
</head>
<body>
    <h1>Dictionary</h1>
    <form action="/Search" method="post">
        <fieldset>
            <legend>Dictionary</legend>
            <label>English:</label>
            <input type="text" name="word">
            <input type="submit" value="Search"><br>
            <span>${result}</span>
        </fieldset>
    </form>
</body>
</html>