-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 2021 m. Bir 22 d. 10:56
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.4.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `u2_kursai`
--

-- --------------------------------------------------------

--
-- Sukurta duomenų struktūra lentelei `komentarai`
--

DROP TABLE IF EXISTS `komentarai`;
CREATE TABLE IF NOT EXISTS `komentarai` (
  `Komentaro_ID` int(11) NOT NULL,
  `Komentaras` varchar(200) COLLATE utf32_swedish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf32 COLLATE=utf32_swedish_ci;

--
-- Sukurta duomenų kopija lentelei `komentarai`
--

INSERT INTO `komentarai` (`Komentaro_ID`, `Komentaras`) VALUES
(1, 'Kursas labai patiko'),
(2, 'Kursas buvo gana ilgokas, bet tikrai apsimokejo'),
(1, 'Daug demesio buvo skirta technikom, o ne teorinem ziniom, labai patenkintas'),
(1, 'Kursai kaip kursai, nei blogai nei kazkas wow'),
(3, 'Visai nieko nedaug naujo bet vistik kazkas praverte'),
(5, 'Brangu ir ne informatyvu'),
(2, 'Daug temu, daug laiko< viskas puiku'),
(3, 'Norm...');

-- --------------------------------------------------------

--
-- Sukurta duomenų struktūra lentelei `kursai`
--

DROP TABLE IF EXISTS `kursai`;
CREATE TABLE IF NOT EXISTS `kursai` (
  `Kurso_autorius` varchar(100) COLLATE utf32_swedish_ci NOT NULL,
  `Ikelimo_data` timestamp NOT NULL DEFAULT current_timestamp(),
  `Pavadinimas` varchar(100) COLLATE utf32_swedish_ci NOT NULL,
  `Aprasymas` varchar(200) COLLATE utf32_swedish_ci NOT NULL,
  `Did_aprasymas` varchar(2000) COLLATE utf32_swedish_ci NOT NULL,
  `Img_kelias` varchar(100) COLLATE utf32_swedish_ci DEFAULT NULL,
  `Populiarumas` int(11) DEFAULT NULL,
  `Komentaro_ID` int(11) NOT NULL AUTO_INCREMENT,
  `Kaina` int(11) DEFAULT NULL,
  `Reitingas` int(11) DEFAULT NULL,
  PRIMARY KEY (`Komentaro_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf32 COLLATE=utf32_swedish_ci;

--
-- Sukurta duomenų kopija lentelei `kursai`
--

INSERT INTO `kursai` (`Kurso_autorius`, `Ikelimo_data`, `Pavadinimas`, `Aprasymas`, `Did_aprasymas`, `Img_kelias`, `Populiarumas`, `Komentaro_ID`, `Kaina`, `Reitingas`) VALUES
('Antanas Antanaitis', '2021-06-22 08:33:12', 'Virejas', 'Virėjo modulinė profesinio mokymo programa skirta parengti kvalifikuotus darbuotojus, gebančiu savarankiškai gaminti, apipavidalinti ir patiekti patiekalus. Įvertinti patiekalų kokybę, tvarkyti dokume', 'Virėjo modulinė profesinio mokymo programa skirta parengti kvalifikuotus darbuotojus, gebančiu savarankiškai gaminti, apipavidalinti ir patiekti patiekalus. Įvertinti patiekalų kokybę, tvarkyti dokumentaciją. Asmuo, įgijęs virėjo kvalifikaciją, galės dirbti virėju įvairių tipų maitinimo paslaugas teikiančiose įmonėse. Virėjo modulinė profesinio mokymo programa skirta parengti kvalifikuotus darbuotojus, gebančiu savarankiškai gaminti, apipavidalinti ir patiekti patiekalus. Įvertinti patiekalų kokybę, tvarkyti dokumentaciją. Asmuo, įgijęs virėjo kvalifikaciją, galės dirbti virėju įvairių tipų maitinimo paslaugas teikiančiose įmonėse.', 'virejas.jpg', 203, 1, 680, 4),
('Vladas Vladauskas', '2021-06-22 08:55:38', 'Suvirintojas', 'Įgiję kvalifikaciją...', 'Įgiję kvalifikaciją asmenys galės dirbti inžinerinės pramonės ir metalo apdirbimo gamyklose...', 'suvirintojas.jpg', 232, 2, 1980, 4),
('Santas Serilis', '2021-06-22 08:55:38', 'Santechnikas', 'Jeigu norite išmokti tinkamai atlikti santechnikos...', 'Jeigu norite išmokti tinkamai atlikti santechnikos darbus, įrengti lietaus vandens nuotekas, remontuoti santechninius prietaisus ir sistemas, naudojant naujas technologijas...', 'santechnikas.png', 598, 3, 2230, 5),
('Ortis Morozovas', '2021-06-22 08:55:38', 'Chemikas', 'Chemija yra visur. Didelė civilizacijos...', 'Chemija yra visur. Didelė civilizacijos pasiekta technologinė pažanga atsirado dėl smalsumo ir pastangų sukurti naujus būdus...', 'chemikas.jpg', 56, 4, 920, 1),
('Borisas Alegedis', '2021-06-22 08:55:38', 'Batsiuvys', 'Batsiuviai ir giminiškų profesijų darbininkai...', 'Batsiuviai ir giminiškų profesijų darbininkai gamina ir taiso standartinę, specialiąją ar ortopedinę avalynę, iš natūralios ir dirbtinės odos gamina galanterijos gaminius, pavyzdžiui...', 'batsiuvys.jpg', 23, 5, 420, 2);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
