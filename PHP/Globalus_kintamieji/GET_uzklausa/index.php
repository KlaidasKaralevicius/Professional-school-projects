<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php
    function show_list ($news) {
        echo '<html>';
        echo '<head>';
        echo '<title>Naujienos</title>';
        echo '</head>';
        echo '<body>';
        echo '<ul>';
        for ($i = 0; $i < count($news); $i++) {
            echo '<li>';
            echo '<a href="?id=' . ($i + 1) . '">';
            echo $news[$i];
            echo '</a>';
            echo '</li>';
            echo '</ul>';
            echo '</body>';
            echo '</html>';
        }
    }

    function show_items ($news, $id) {
        echo '<html>';
        echo '<head>';
        echo '<title>Naujienos #$id</title>';
        echo '</head>';
        echo '<body>';
        echo '<a href="/Globalus_kintamieji/GET_uzklausa">Sugryzti prie naujienu</a>';
        echo '<p>';
        echo $news[$id - 1];
        echo '</p>';
        echo '<p>Naujienos, info, img ir t.t.';
        echo '</body>';
        echo '<html>';
    }

    $news = array();
    $news [0] = 'Pirma naujiena';
    $news [1] = 'Antra naujiena';
    $news [2] = 'Trecia naujiena';

    if (isset($_GET['id'])) {
        show_items($news, $_GET['id']);
    } else {
        show_list($news);
    }
    ?>
</body>
</html>