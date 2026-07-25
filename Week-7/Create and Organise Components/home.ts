import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-home',
  imports: [
    FormsModule
  ],
  templateUrl: './home.html',
  styleUrl: './home.css'
})
export class Home {

  // Interpolation
  portalName = 'Student Course Portal';

  // Property Binding
  isPortalActive = true;

  // Event Binding message
  message = '';

  // Two-way binding
  searchTerm = '';


  // Button click function
  onEnrollClick() {
    this.message = 'Enrollment opened!';
  }

}