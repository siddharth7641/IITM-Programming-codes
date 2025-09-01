function validate(event){
    v = document.getElementById("email").value;
    if (v.indexOf("@") == -1) {
        alert("Please enter a valid email address.");
        event.preventDefault();
    }
}

