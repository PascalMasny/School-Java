document.addEventListener('DOMContentLoaded', listener);

function listener() {

    document.querySelector('#rechnen').addEventListener('click', datumRechnen);
    document.querySelector('#löschen').addEventListener('click2', ausgabeLöschen);

}

function datumRechnen() {

    var start = document.getElementById('start').value;
    var end = document.getElementById('end').value;

    for (var i = start; i <= end; i++) {

        var a = i % 19;
        var b = i % 4;
        var c = i % 7;
        var M = 15;
        var d = (19 * a + M) % 30;
        var N = 6;
        var e = (2 * b + 4 * c + 6 * d + N) % 7;

        console.log(d + "." + e + "." + i);

    }

}