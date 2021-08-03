<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Komandos zaidejai</title>
    <link href="css/style.css" rel="stylesheet">
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
    <?php
    $team = $_GET['team'];
    echo '<h1>' . $team . ' zaidejai</h1>'
    ?>

    <?php
    $connection = mysqli_connect('localhost', 'root', '', 'sportas');

    if (mysqli_connect_errno()) {
        die("connection failed: " . mysqli_connect_error() . " (" . mysqli_connect_errno() . ")");
    }

    echo '<table class="data-table">
            <tr class="data-heading">         
                <td>Vardas</td>
                <td>Nuotrauka</td>
            </tr>';

    $players = mysqli_query($connection, "SELECT * FROM players WHERE team='$team'");

    foreach ($players as $player) {
        echo '<tr>';
        echo '<td> <a href="zaidejai.php?id=' . $player['ID'] . '">' . $player['Name'] . '</a> </td>';
        echo '<td> <img class="players" src="' . $player['Picture'] . '"  alt="' . $player['Name'] . '" /></td>';
        echo '</tr>';
    }

    echo "</table>";
    ?>

    <p><a href="index.php">Gryzti i praita puslapi</a></p>
</body>
</html>