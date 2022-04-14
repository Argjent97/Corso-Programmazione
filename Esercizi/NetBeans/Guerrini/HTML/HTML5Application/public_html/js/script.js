/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/ClientSide/javascript.js to edit this template
 */


function caricadati() {
    let objrisposta = document.getElementById("spnome");
    objrisposta.innerHTML = "La risposta alla tua domanda è la seguente:";

    let objtit = document.getElementById("titolo");
    objtit.innerHTML = "Stretta la foglia, larga la via, dite la vostra che ho detto la mia";

    let file = "https://catfact.ninja/fact";

    fetch(file)
            .then(x => {
                let res = x.json();
                return res;
            }
            )
            .then(y => objrisposta.innerHTML =
                        y.fact);
}