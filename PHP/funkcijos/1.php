<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>1 uzduotis</title>
</head>
<body>
    <?php
    function apsSuma($a, $b) {
        $sum = $a + $b;
        return $sum;
    }
    function showSum($a, $b) {
        echo "Sum of $a and $b is ";
    }
    echo showSum(22, 66) . apsSuma(22, 66);
    ?>
</body>
</html>