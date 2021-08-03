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
    <?php
    echo '<br>';
    echo 'Isvedame masyva $_GET<br>';
    echo '<br>';

    echo '<pre>';
    print_r($_GET);
    echo '</pre>';
    ?>
    <hr>
    <p><b>
            <FONT FACE="Comic Sans MS">
                <pre>Funkcijos isvedimas</pre>
            </FONT>
        </b></p>
    <?php
    $masFormStart = array('action' => 'forma_funkcija.php', 'method' => 'POST');

    echo '<pre>';
    print_r($masFormStart);
    echo '</pre>';

    function formStart($masyvas)
    {
        echo '<form' . getMas($masyvas) . '>';
    }

    function inputText1()
    {
        echo '<input type="text" name="newFirst"><br><br>';
    }

    function inputText2()
    {
        echo '<input type="text" name="newSecond"><br><br>';
    }

    function submit()
    {
        return '<input type="submit" name="submit" value="Paspausti">';
    }

    function formEnd()
    {
        echo '</form>';
    }

    function getMas($arr)
    {
        $str = '';
        foreach ($arr as $name => $value) {
            $str .= $name . '="' . $value . '" ';
        }
        return $str;
    }

    formStart($masFormStart);
    inputText1();
    inputText2();
    echo submit();
    formEnd();
    ?>
</body>

</html>