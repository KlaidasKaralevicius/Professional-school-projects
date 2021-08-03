<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Insert</title>
</head>
<body>
    <?php
        $mysqli = mysqli_connect ("localhost", "root", "ems", "testdb");
        if (mysqli_connect_errno()) {
            printf ("Connect failed: %s\n", mysqli_connect_error());
            exit();
        } else {
            $sql = "INSERT INTO testTable (testField) VALUES ('" . $_POST["testfield"] . "')";
            $res = mysqli_query ($mysqli, $sql);
            if ($res == TRUE) {
                echo "A record has been inserted";
            } else {
                printf ("Could not insert record: %s\n", mysqli_error ($mysqli));
            }
            mysqli_close ($mysqli);
        }
    ?>
    
</body>
</html>