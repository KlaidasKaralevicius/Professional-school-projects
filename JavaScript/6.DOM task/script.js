class Header {
    constructor(headerH, headerP) {
        this.headerH = headerH;
        this.headerP = headerP;
    }
    insertHeader() {
        const heading = document.querySelector('header');
        const h1 = document.createElement('h1');
        const p = document.createElement('p');

        h1.innerText = this.headerH;
        p.innerText = this.headerP;

        heading.append(h1);
        heading.append(p);
    }
}

class CardContent {
    constructor(image, name, location, info) {
        this.image = image;
        this.name = name;
        this.location = location;
        this.info = info;
    }
    insertContent() {
        const main = document.querySelector('main');
        const section = document.createElement('section');
        const img = document.createElement('img');
        const name = document.createElement('p');
        const info = document.createElement('p');
        const div = document.createElement('div');
        const p = document.createElement('p');
        const location = document.createElement('i');
        const span = document.createElement('span');
        const arr = ['fab', 'fa-facebook-f', 'fab', 'fa-twitter', 'fab', 'fa-google', 'fab', 'fa-instagram'];

        main.append(section);
        section.classList.add('card');

        section.append(img);
        img.classList.add('profile');
        img.src = this.image;

        section.append(name);
        name.innerHTML = "<span class='name'>" + this.name + "</span> <br>";
        name.append(span);
        span.classList.add('location');
        location.classList.add('fas', 'fa-map-marker-alt');
        span.append(location);
        span.append(this.location);

        section.append(info);
        info.innerText = this.info;

        section.append(div);
        div.classList.add('media');
        div.append(p);
        p.innerText = "Get Connected";

        for (let j = 0; j < 8; j = j + 2) {
            let i = document.createElement('i');
            div.append(i);
            i.classList.add(arr[j], arr[j+1]);
        }

    }
}

const header = new Header(
    'Find. Connect. Enjoy.', 
    'new way to meet people'
);
header.insertHeader();

const card1 = new CardContent(
    'profile-images/17.jpg',
    'Sammy M Stoll',
    'Wellsville, New York(NY), 14895',
    'Social media junkie. Avid food nerd. Professional travel fan. Tv fanatic. Bacon geek. Web fanatic.'
)
card1.insertContent();

const card2 = new CardContent(
    'profile-images/46.jpg',
    'James C Young',
    '2597 Meadowbrook Mall Road',
    'Certified food specialist. Pop culture geek. Typical travel evangelist. Award-winning analyst. Zombie lover.'
)
card2.insertContent();

const card3 = new CardContent(
    'profile-images/16.jpg',
    'Deanna I Martin',
    'Worthington, Ohio(OH), 43085',
    'Zombie ninja. Wannabe internet buff. Proud introvert. Bacon expert. Social media trailblazer.'
)
card3.insertContent();

const card4 = new CardContent(
    'profile-images/55.jpg',
    'Bruce K Collins',
    'Westhampton Beach, New York(NY), 11978',
    'Wannabe social media aficionado. Thinker. Unapologetic beer guru. Internet lover. Avid food buff.'
)
card4.insertContent();

const card5 = new CardContent(
    'profile-images/34.jpg',
    'Claudette G Hann',
    'Philadelphia, Pennsylvania(PA), 19108',
    'Twitter practitioner. Devoted thinker. Hipster-friendly problem solver. Social media expert.'
)
card5.insertContent();

const card6 = new CardContent(
    'profile-images/51.jpg',
    'Robert Langdon',
    '15 Eagle Way. AL10 8RD',
    'Typical gamer. Friendly coffee practitioner. Alcohol buff. Extreme pop cultureaholic.'
)
card6.insertContent();

const card7 = new CardContent(
    'profile-images/21.jpg',
    'Amber C Pantoja',
    'Nashville, Tennessee(TN), 37209',
    'Wannabe pop culture expert. Alcohol fanatic. Unapologetic introvert. Subtly charming communicator.'
)
card7.insertContent();

const card8 = new CardContent(
    'profile-images/23.jpg',
    'Adriana E Hubert',
    'Burlington, North Carolina(NC), 27215',
    'Pop culture fanatic. Hardcore analyst. Infuriatingly humble reader. Incurable troublemaker.'
)
card8.insertContent();