<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>2 uzduotis</title>
</head>

<body>
    <?php
    function apsSuma($a, $b)
    {
        $sum = $a + $b;
        return $sum;
    }
    function showSum($a, $b)
    {
        echo "Sum of $a and $b is " . apsSuma($a, $b);
    }
    showSum(22, 66);
    ?>
</body>

</html>