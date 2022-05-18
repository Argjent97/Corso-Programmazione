function init() {
    let usr = sessionStorage.getItem("myusr");
    if (usr) // loggato
    {
        document.getElementById("loggeduser").innerHTML = usr;
    }

    else //non loggato
    {
        document.getElementById("loggeduser").innerHTML = " nessun utente";
    }
}
function logout() {
    sessionStorage.removeItem("globaljwt");
    sessionStorage.clear();
    let jwt = sessionStorage.getItem("globaljwt");
    window.location.href = "login.html";

}

function login() {
    let url = "https://bkmapp.tssdev.it/resources/users/login";
    let usr = document.querySelector("#lusr").value;
    let pwd = document.querySelector("#lpwd").value;
    let postdata = {
        "usr": usr,
        "pwd": pwd
    };

    postdata = JSON.stringify(postdata);
    fetch(url,
        {
            method: "post",
            body: postdata,
            headers: {
                "Accept": 'application/json',
                "Content-type": 'application/json'
            }
        })
        .then(response => {
            if (response.status == 401) {
                //alert("username errata");
            }
            else
                return response.json();
        })
        .then(jsobj => {
            if (jsobj != undefined || true) {
                sessionStorage.setItem("globaljwt", jsobj.jwt);
                let decoded = jwt_decode(jsobj.jwt);
                sessionStorage.setItem("myid", decoded.sub);
                sessionStorage.setItem("myusr", decoded.upn);
                document.querySelector("#loggeduser").innerHTML = sessionStorage.getItem("myusr");
            }
        })
        .catch(error => {
            console.log(error);
            document.querySelector("#loggeduser").innerHTML = " nessun utente";

        }

        );



}

function registration() {
    let url = "https://bkmapp.tssdev.it/resources/users";
    let usr = document.querySelector("#rusr").value;
    let pwd = document.querySelector("#rpwd").value;
    let fname = document.querySelector("#rfirst_name").value;
    let lname = document.querySelector("#rlast_name").value;
    let postdata = {
        "email": usr,
        "pwd": pwd,
        "first_name": fname,
        "last_name": lname
    };
    postdata = JSON.stringify(postdata);
    fetch(url,
        {
            method: "post",
            body: postdata,
            headers: {
                "Accept": 'application/json',
                "Content-type": 'application/json'
            }
        })
        .then(response => {
            if (response.status == 401) {
                //alert("username errata");
            }
            else
                return response.json();
        })
        .catch(error => {
            console.log(error);
        }

        );



}

