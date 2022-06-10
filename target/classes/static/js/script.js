
function goToLink(path){
    
    var myDomain = 'http://localhost:8080';
    window.location.href = myDomain + "/" + path;
  }

function error(){
    alert("error");
}


//var emptyRow = "<tr><td colspan='6' class='text-center'> No Records Available</td></tr>";


$("#faddCPFId").inputmask({
  mask: "999.999.999-99"
});
$("#fCPFId").inputmask({
  mask: "999.999.999-99"
});

function mostrarTodos(){
    var table = document.getElementById("tblBody");
    const xhttp = new XMLHttpRequest();
    xhttp.onload = function(){
    document.getElementById("resposta_div").textContent = this.responseText;
    var jsonData = JSON.parse(this.responseText);
    for (var i = 0; i < jsonData.counters.length; i++) {
        var counter = jsonData.counters[i];
        var row = table.insertRow(0);
        var id = row.insertCell(0);
        var nome = row.insertCell(1);
        var cpf = row.insertCell(2);
        var email = row.insertCell(3);
        id.innerHTML = counter.id;
        nome.innerHTML = counter.nome;
        cpf.innerHTML = counter.cpf;
        email.innerHTML = counter.email;
        console.log(counter);
    }

    }

//    const client = JSON.parse(this.responseText);

    xhttp.open("GET", "/clientTodos?");
    xhttp.send();
    //Jquery

}

function adicionar(){
    var nome = document.getElementById("faddnameId").value
    var CPF = document.getElementById("faddCPFId").value
    var email = document.getElementById("faddemailId").value

    const xhttp = new XMLHttpRequest();
    xhttp.onload = function(){
    document.getElementById("resposta_div").textContent = this.responseText
    }

    xhttp.open("GET", "/clientAdicionar?faddname="+nome+"&faddCPF="+CPF+"&faddemail="+email);
    xhttp.send();
}

function alterar(){
    var id = document.getElementById("faltidId").value
    var nome = document.getElementById("faltnameId").value
    var CPF = document.getElementById("faltCPFId").value
    var email = document.getElementById("faltemailId").value

    const xhttp = new XMLHttpRequest();
    xhttp.onload = function(){
    document.getElementById("resposta_div").textContent = this.responseText
    }

    xhttp.open("GET", "/clientAlterar?faltid="+id+"&faltname="+nome+"&faltCPF="+CPF+"&faltemail="+email);
    xhttp.send();
}

function buscarClienteId(){
    var id = document.getElementById("fidId").value

    const xhttp = new XMLHttpRequest();
    xhttp.onload = function(){
    document.getElementById("resposta_div_id").textContent = this.responseText;
    }
    xhttp.open("GET", "/clientBuscarId?fid="+id);
    xhttp.send();


}

function buscarClienteNome(){
    var nome = document.getElementById("fnameId").value

    const xhttp = new XMLHttpRequest();
    xhttp.onload = function(){
    document.getElementById("resposta_div_nome").textContent = this.responseText;
    }
    xhttp.open("GET", "/clientBuscarNome?fname="+nome);
    xhttp.send();
}

function deletar(){
    var id = document.getElementById("fdeleteId").value

    const xhttp = new XMLHttpRequest();
    xhttp.onload = function(){
    document.getElementById("resposta_div").textContent = this.responseText;
    }
    xhttp.open("GET", "/clientDeletar?fdeleteid="+id);
    xhttp.send();
}

