import { Component } from '@angular/core';

@Component({
  selector: 'product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css'],
})
export class ProductListComponent {
  isButtonDisabled: boolean = true;
  isHighlighted: boolean = true;
  textColor: string = 'blue';
}
