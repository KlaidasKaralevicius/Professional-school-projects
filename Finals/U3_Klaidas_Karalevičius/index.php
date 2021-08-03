<?php
require "connect.php";
?>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.15.3/css/all.css" integrity="sha384-SZXxX4whJ79/gErwcOYf+zWLeJdY/qpuqC4cAa9rOGUstPomtqpuNWT9wdPEn2fk" crossorigin="anonymous">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Exo:wght@200;400&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="css/style.css">
    <title>Document</title>
</head>

<body>
    <header>
        <img src="img/logo.png" alt="vtmc logo">
    </header>
    <section class="cards">
        <h2>Naujausi kursai</h2>
        <main>
            <?php

            $query = "SELECT * FROM kursai";
            $result = mysqli_query($connect, $query);

            if (mysqli_num_rows($result) > 0) {

                while ($row = mysqli_fetch_array($result)) {
                    $courseID = $row['Komentaro_ID'];
                    $count = "SELECT count(*) as commentCount FROM `komentarai` WHERE Komentaro_ID = '$courseID'";
                    $countResult = $connect->query($count);
                    $comments = $countResult->fetch_assoc();
                    $rating = $row['Reitingas'];
                    $ID = $row['Pavadinimas'];
                    $name = $row['Kurso_autorius'];
            ?>

                    <div class="<?php echo $row['Pavadinimas']; ?>">
                        <img src="img/<?php echo $row['Img_kelias']; ?>" alt="<?php echo $row['Pavadinimas']; ?> image">
                        <section class="cardText">
                            <h3><a href="#"><?php echo $row['Pavadinimas']; ?></a></h3>
                            <p class="author"><?php echo $row['Kurso_autorius']; ?></p>
                            <hr>
                            <p><?php echo $row['Aprasymas']; ?></p>
                            <hr>
                            <p>
                                <span class="rating">
                                    <?php
                                    echo "
                                        <select onchange='location = this.value'>
                                            <option class='current' disabled selected>$rating</option>
                                            <option value='changeRating.php?ID=$ID&name=$name&rating=1'>1</option>
                                            <option value='changeRating.php?ID=$ID&name=$name&rating=2'>2</option>
                                            <option value='changeRating.php?ID=$ID&name=$name&rating=3'>3</option>
                                            <option value='changeRating.php?ID=$ID&name=$name&rating=4'>4</option>
                                            <option value='changeRating.php?ID=$ID&name=$name&rating=5'>5</option>
                                        </select>
                                        ";
                                    ?>
                                </span>
                                <span class="comment">
                                    <i class="fas fa-comment"></i>
                                    <span class="commentNumber"><?php echo $comments['commentCount']; ?></span>
                                </span>
                            </p>
                        </section>
                    </div>
            <?php
                }
            }
            ?>
    </section>
    </main>
    <section class="form" onsubmit="subscription();">
        <div class="message" class="alert alert-success visually-hidden" role="alert">
            Ačiū sėkmingai užsisakius mūsų naujienlaiškį <span id="user"></span>
        </div>
        <h2>Sekite naujienas</h2>
        <p>Norite gauti pranešimus apie naujus kursus? Užsakykite mūsų naujienlaiškį!</p>
        <form>
            <label for="name">Vardas</label><br>
            <input type="text" id="name" name="name"><br><br>
            <label for="email">El. paštas</label><br>
            <input type="email" id="email" name="email"><br><br>
            <input id="submit" type="submit" value="Užsisakyti">
        </form>
    </section>
    <footer>
        <hr>
        <p>&#169; 2021 Klaidas Karalevičius</p>
    </footer>
</body>
<script src="js/script.js"></script>

</html>