import { Component } from '@angular/core';

@Component({
  selector: 'app-button-click',
  templateUrl: './button-click.component.html',
  styleUrls: ['./button-click.component.css'],
})
export class ButtonClickComponent {
  message: string = '';

  onButtonClick() {
    this.message = 'Button clicked!';
  }
}
