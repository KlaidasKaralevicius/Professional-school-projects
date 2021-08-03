<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Record Insertion Form</title>
</head>

<body>
    <form action="insert.php" method="POST">
        <p>Text to Add:
            <br>
            <input type="text" name="testfield" size="30">
        </p>
        <button type="submit">insert value</button>
    </form>

    <?php
    // $mysqli = mysqli_connect("localhost", "root", "ems", "testdb");
    // if (mysqli_connect_errno()) {
    //     printf("Connect failed: %s\n", mysqli_connect_error());
    //     exit();
    // } else {
    //     printf("Host information: %s\n", mysqli_get_host_info($mysqli));
    //     mysqli_close($mysqli);
    //     echo "<br>";
    // }
    ?>

    <?php
    // $mysqli = mysqli_connect("localhost", "root", "ems", "testDB");
    // if (mysqli_connect_errno()) {
    //     printf("Connect failed: %s\n", mysqli_connect_error());
    //     exit();
    // } else {
    //     $sql = "CREATE TABLE testTABLE" . "(id INT NOT NULL PRIMARY KEY AUTO_INCREMENT, testField VARCHAR(75))";
    //     $res = mysqli_query($mysqli, $sql);
    //     if ($res == TRUE) {
    //         echo "Table testTable successfully created.";
    //     } else {
    //         printf("Could not create table: %s\n", mysqli_error($mysqli));
    //     }
    //     mysqli_close($mysqli);
    // }
    ?>
    <!-- 2 php kodai mySQL lentelės sukurimui ir prijungimui, po 
    aktivacijos įdėjau i komentara, kad paslėpti nebereikalingus pranešimus -->
</body>

</html>