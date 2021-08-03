<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Metodai</title>
</head>

<body bgcolor="#FFFFF0" text="#000FF">
    <form>
        <input type="text" name="first"><br><br>
        <input type="text" name="second"><br><br>
        <input type="submit" name="submit" value="Send"><br><br>
    </form>
    <hr>
    <p><b><FONT FACE="Comic Sans MS">
        <pre>Forma PHP priemones</pre>
    </FONT></b></p>
    
    <?php
    echo '<form action="forma_metodas.php" method="POST">';
    echo '<input type="text" name="newFirst"><br><br>';
    echo '<input type="text" name="newSecond"><br><br>';
    echo '<input type="submit" name="submit" value="Paspausti">';
    echo '</form>';

    echo '<hr>';

    echo '<br>';
    echo 'Isvedame masyva $_POST<br>';
    echo '<br>';

    echo '<pre>';
    print_r($_POST);
    echo '</pre>';

    echo '<hr>';

    echo '<br>';
    echo 'Isvedame masyva $_GET<br>';
    echo '<br>';

    echo '<pre>';
    print_r($_GET);
    echo '</pre>';
    ?>
</body>

</html>