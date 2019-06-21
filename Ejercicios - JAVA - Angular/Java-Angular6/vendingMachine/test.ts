// class Test{

//     //Constructor De La Clase
//     constructor(public message: string){};

// }

// console.log("hola");
// console.log("pepe");

//Node JS (Server JS))
//NPM & YARN SPA(Single Page Applicattion)
//CLI -> npm install -g @angular/cli
//Crear Carpeta -> ng new bike-ui --routing
//ng serve || npm start
//Browser localhost:4200
//proxy.conf.json
//Agregar El Proxy Al Package.json
//Package.json -> Es Como Maven
//Crear Service -> ng g service service/bike

//Yarn Manejo De Dependencias De Angular
//npm install -g @angular/cli Para Instalar El Command Line Interface
//ng --version Para Ver Las Caracteristicas Del CLI
//ng new bike-ui --routing (Este Comando Crea Una Aplicacion)
//cd bike-ui
//code .
// ng serve || npm start

import{Category} from './js/enum';
import{Book} from './js/IBook';

function getAllBooks(){
    //Creamos Un Array De Libros, Cada Libro Con 4 Propiedades
    let books = [
        {title: "ulises", author: "jose vargas", available: false, categoria: Category.BIOGRAFIA},
        {title: "fuego", author: "emilialo alorda", available: true, categoria: Category.FICCION},
        {title: "tierra", author: "rodrigo perez", available: true, categoria: Category.HISTORIA}, 
        {title: "aire", author: "joaquin", available: false, categoria: Category.INFANTILES},
        {title: "agua", author: "juan miron", available: false, categoria: Category.POESIA},
        {title: "trueno", author: "jose marquez", available: false, categoria: Category.HISTORIA}
    ];
    return books;
}

//Funcion Que Recibe Un Array De Libros Y Registrara En Otro Array
//El Primer Libro Que Este Disponible
function logFirstAvailable(books) : void {
    //Variable Que Almacene El Primer Titulo Disponible
    let numberOfBooks : number = books.length;
    let firstAvailable : string = '';
    //Valido Si El Libro Esta Disponible
    for(let currentBook of books){

        if(currentBook.available){
            firstAvailable = currentBook.title;
            break;
        }
    }
    //Muestro El Total De La Cantidad De Libros
    console.log('Total De Libros: ' + numberOfBooks);
    //Muestro El Primer Libro Que Capture Dentro Del For
    console.log('Primer Libro Disponible: ' + firstAvailable);
}

 function scopeTest(){
    let bar = 'use in this block';
     if(true){
         var foo = "use anywhere"; //var - Usamos Para Variables Globales
         //let - Usamos Para Variables De Bloques
     }
 
     console.log(foo);
     console.log(bar);
    }

console.log("Probando");
scopeTest();

//Recibe Una Categoria Como Parametro Y Devuelve Un Array De String Con El Conjunto De Libros
function getBooksTitlesByCategory(categoryFilter: Category) : Array<string> {
    //Muestro La Categoria Que Recibimos Por Parametro
    console.log('Getting Book In Category : ' + Category[categoryFilter]);
    //Almaceno Todos Los Libros En Una Constante
    const allBooks = getAllBooks();
    //Creo Un Array De String Vacio, Para Almacenar Los Titulos De Los Libros Que Coinciden Con El Parametro Category Filter
    const filteredTitles : string[] = [];
    //Buscamos Todos Los Libros Con Esa Categoria
    for(let currentBook of allBooks){

        if(currentBook.categoria === categoryFilter){
            //Agregamos A Nuestro Array De Libros
            filteredTitles.push(currentBook.title);
        }
    }
    return filteredTitles;
}



function logBooksTitles(titles : string[]) : void {
    for(let title of titles){
        console.log(title);
    }
}

//Declaro Una Constante Y Le Asigno El Valor Devuelto Por La Funcion getAllBooks
const todosLosLibros = getAllBooks();
//Solo Garantiza Que El Identificador No Se Modificara Al Hacer Referencia A Algo Completamente Diferente
todosLosLibros.push({ title: "moby dick", author: "jose ramon", available: true, categoria: Category.FICCION });
todosLosLibros.push({ title: "free fire", author: "raul montez", available: false, categoria : Category.INFANTILES });

logFirstAvailable(todosLosLibros);
logFirstAvailable(getAllBooks());

console.log('+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++');
const titulos = getBooksTitlesByCategory(Category.POESIA);
logBooksTitles(titulos);

const titulos2 = getBooksTitlesByCategory(Category.HISTORIA);
logBooksTitles(titulos2);