function getEmail() {
    let input = document.getElementById("email").value;
    document.getElementById('user').innerHTML = input;
};

function subscription() {
    let name = document.getElementById("name").value;
    let email = document.getElementById("email").value;
    let message = document.querySelector(".message");

    if (!name || !email) {
        alert("Būtina užpildyti visus laukus!");
    } else {
        message.classList.remove("hidden");
        setTimeout(function () {
            message.classList.add("hidden");
        }, 6000);
    }
}

