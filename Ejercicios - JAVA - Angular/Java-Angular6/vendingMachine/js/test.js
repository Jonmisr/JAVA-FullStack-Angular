// class Test{
//     //Constructor De La Clase
//     constructor(public message: string){};
// }
// console.log("hola");
// console.log("pepe");
function getAllBooks() {
    //Creamos Un Array De Libros, Cada Libro Con 4 Propiedades
    var books = [
        { title: "ulises", author: "jose vargas", available: false, categoria: Category.BIOGRAFIA },
        { title: "fuego", author: "emilialo alorda", available: true, categoria: Category.FICCION },
        { title: "tierra", author: "rodrigo perez", available: true, categoria: Category.HISTORIA },
        { title: "aire", author: "joaquin", available: false, categoria: Category.INFANTILES },
        { title: "agua", author: "juan miron", available: false, categoria: Category.POESIA },
        { title: "trueno", author: "jose marquez", available: false, categoria: Category.HISTORIA }
    ];
    return books;
}
//Funcion Que Recibe Un Array De Libros Y Registrara En Otro Array
//El Primer Libro Que Este Disponible
function logFirstAvailable(books) {
    //Variable Que Almacene El Primer Titulo Disponible
    var numberOfBooks = books.length;
    var firstAvailable = '';
    //Valido Si El Libro Esta Disponible
    for (var _i = 0, books_1 = books; _i < books_1.length; _i++) {
        var currentBook = books_1[_i];
        if (currentBook.available) {
            firstAvailable = currentBook.title;
            break;
        }
    }
    //Muestro El Total De La Cantidad De Libros
    console.log('Total De Libros: ' + numberOfBooks);
    //Muestro El Primer Libro Que Capture Dentro Del For
    console.log('Primer Libro Disponible: ' + firstAvailable);
}
function scopeTest() {
    var bar = 'use in this block';
    if (true) {
        var foo = "use anywhere"; //var - Usamos Para Variables Globales
        //let - Usamos Para Variables De Bloques
    }
    console.log(foo);
    console.log(bar);
}
console.log("Probando");
scopeTest();
//Recibe Una Categoria Como Parametro Y Devuelve Un Array De String Con El Conjunto De Libros
function getBooksTitlesByCategory(categoryFilter) {
    //Muestro La Categoria Que Recibimos Por Parametro
    console.log('Getting Book In Category : ' + Category[categoryFilter]);
    //Almaceno Todos Los Libros En Una Constante
    var allBooks = getAllBooks();
    //Creo Un Array De String Vacio, Para Almacenar Los Titulos De Los Libros Que Coinciden Con El Parametro Category Filter
    var filteredTitles = [];
    //Buscamos Todos Los Libros Con Esa Categoria
    for (var _i = 0, allBooks_1 = allBooks; _i < allBooks_1.length; _i++) {
        var currentBook = allBooks_1[_i];
        if (currentBook.categoria === categoryFilter) {
            //Agregamos A Nuestro Array De Libros
            filteredTitles.push(currentBook.title);
        }
    }
    return filteredTitles;
}
//Creo Un Enum
var Category;
(function (Category) {
    Category[Category["BIOGRAFIA"] = 0] = "BIOGRAFIA";
    Category[Category["POESIA"] = 1] = "POESIA";
    Category[Category["FICCION"] = 2] = "FICCION";
    Category[Category["HISTORIA"] = 3] = "HISTORIA";
    Category[Category["INFANTILES"] = 4] = "INFANTILES";
})(Category || (Category = {}));
function logBooksTitles(titles) {
    for (var _i = 0, titles_1 = titles; _i < titles_1.length; _i++) {
        var title = titles_1[_i];
        console.log(title);
    }
}
//Declaro Una Constante Y Le Asigno El Valor Devuelto Por La Funcion getAllBooks
var todosLosLibros = getAllBooks();
//Solo Garantiza Que El Identificador No Se Modificara Al Hacer Referencia A Algo Completamente Diferente
todosLosLibros.push({ title: "moby dick", author: "jose ramon", available: true, categoria: Category.FICCION });
todosLosLibros.push({ title: "free fire", author: "raul montez", available: false, categoria: Category.INFANTILES });
logFirstAvailable(todosLosLibros);
logFirstAvailable(getAllBooks());
console.log('+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++');
var titulos = getBooksTitlesByCategory(Category.POESIA);
logBooksTitles(titulos);
var titulos2 = getBooksTitlesByCategory(Category.HISTORIA);
logBooksTitles(titulos2);
//# sourceMappingURL=test.js.map