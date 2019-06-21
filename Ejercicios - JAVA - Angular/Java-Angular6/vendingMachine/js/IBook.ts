import{Category} from './enum';

interface Book {
    id: number;
    title: string;
    author: string;
    available: Boolean;
    category: Category;
}

export{Book};