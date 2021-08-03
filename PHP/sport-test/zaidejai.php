<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Statistika</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
    <h1>Statistika</h1>

    <?php
    $player_statistics = explode("\n", file_get_contents('statistika/' . $_GET['id'] . '.txt'));
    $successful_throw = 0;

    foreach ($player_statistics as $pass) {
        if ($pass == 2) {
            $successful_throw = $successful_throw + 1;
        }
    }

    $avg = $successful_throw * 100 / count($player_statistics);
    ?>

    <p>Mesti dvitaskiai: <?php echo count($player_statistics); ?></p>
    <p>Pataikyta: <?php echo $successful_throw; ?></p>
    <p>Nepataikyta: <?php echo count($player_statistics) - $successful_throw; ?>
    <p>
    <p>Zaidejo pataikymo procentas: <?php echo $avg; ?>%</p>

    <?php
    $connection = mysqli_connect('localhost', 'root', '', 'sportas');
    $player_id = $_GET['id'];
    $result = mysqli_query($connection, "SELECT * FROM players WHERE ID='$player_id'");
    $player = mysqli_fetch_assoc($result);
    $team = $player['Team'];
    echo '<p><a href="komandos.php?team=' . $team . '">Gryzti i praita puslapi</a></p>'
    ?>
</body>
</html>