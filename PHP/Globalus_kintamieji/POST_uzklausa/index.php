<?php
function show_form() {
    echo '<html>';
    echo '<head>';
    echo '<title>Sumos skaiciuotuvas</title>';
    echo '</head>';
    echo '<body>';
    echo '<form action=" " method="POST">';
    echo '<input type="text" name="a" />';
    echo '+';
    echo '<input type="text" name="b" />';
    echo '<input type="submit" value="=" />';
    echo '</form>';
    echo '</body>';
    echo '</html>';
}

function show_result($a, $b) {
    $result = $a + $b;
    echo '<html>';
    echo '<head>';
    echo '<title>Sumos skaiciuotuvas</title>';
    echo '</head>';
    echo '<body>';
    echo '<p>';
    echo "$a + $b = <b>$result</b>";
    echo '</p>';
    echo '<p>';
    echo '<a href=" ">Grizti prie skaiciuotuvo</a>';
    echo '</p>';
    echo '</body>';
    echo '</html>';
}

if (isset($_POST['a']) && isset($_POST['b'])) {
    show_result($_POST['a'], $_POST['b']);
} else {
    show_form();
}
?>
