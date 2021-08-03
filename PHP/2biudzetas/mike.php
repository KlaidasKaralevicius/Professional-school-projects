<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Mike's expense</title>
    <link rel="stylesheet" href="css/style2.css">
</head>

<body>
    <?php
    $name = array('Product', 'Price for one', 'Quantity', 'Hammer', 'Saw', 'Nails', 'Srewdriver', 'Pliers');
    $price = array(8.56, 6.77, 0.15, 3.32, 4.55);
    $quantity = array(1, 1, 60, 3, 2);
    $totalPrice = 0;
    echo "<table><tr><th>$name[0]</th>";
    echo "<th>$name[1]</th>";
    echo "<th>$name[2]</th></tr>";
    echo "<tr><td>$name[3]</td>";
    echo "<td>$price[0]$</td>";
    echo "<td>$quantity[0]</td></tr>";
    echo "<tr><td>$name[4]</td>";
    echo "<td>$price[1]$</td>";
    echo "<td>$quantity[1]</td></tr>";
    echo "<tr><td>$name[5]</td>";
    echo "<td>$price[2]$</td>";
    echo "<td>$quantity[2]</td></tr>";
    echo "<tr><td>$name[6]</td>";
    echo "<td>$price[3]$</td>";
    echo "<td>$quantity[3]</td></tr>";
    echo "<tr><td>$name[7]</td>";
    echo "<td>$price[4]$</td>";
    echo "<td>$quantity[4]</td></tr></table><br>";
    for ($i = 0; $i < 5; $i++) {
        $totalPrice = $totalPrice + $price[$i] * $quantity[$i];
    }
    echo "Total price: " . $totalPrice . "$";
    ?>
</body>

</html>