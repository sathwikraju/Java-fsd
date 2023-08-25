import { Component, Output, EventEmitter, Input } from '@angular/core';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css'],
})
export class ChildComponent {
  @Input() childInput: string = '';
  @Output() childInputChange = new EventEmitter<string>();

  sendDataToParent() {
    this.childInputChange.emit(this.childInput);
  }
}
