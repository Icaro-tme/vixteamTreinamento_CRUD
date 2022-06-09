
function goToLink(path){
    
    var myDomain = 'http://localhost:8080';
    window.location.href = myDomain + "/" + path;
  }

function error(){
    alert("error");
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

function buscarClienteCPF(){
    var CPF = document.getElementById("fCPFId").value

    const xhttp = new XMLHttpRequest();
    xhttp.onload = function(){
    document.getElementById("resposta_div_CPF").textContent = this.responseText;
    }
    xhttp.open("GET", "/clientBuscarCPF?fCPF="+CPF);
    xhttp.send();
}
