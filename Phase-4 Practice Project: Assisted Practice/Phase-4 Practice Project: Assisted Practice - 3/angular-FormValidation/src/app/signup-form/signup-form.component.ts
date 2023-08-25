import { Component } from '@angular/core';

@Component({
  selector: 'app-signup-form',
  templateUrl: './signup-form.component.html',
  styleUrls: ['./signup-form.component.css'],
})
export class SignupFormComponent {
  firstName: string = '';
  lastName: string = '';
  email: string = '';
  password: string = '';

  submitted: boolean = false;

  submitForm() {
    this.submitted = true;
  }
}
