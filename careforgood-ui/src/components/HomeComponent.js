import { Component } from 'react';
import VolunteerService from '../services/VolunteerService';

class HomeComponent extends Component {

  constructor(props){
    super(props);

    this.state = {
//      id:
      volunteers: {}
    }
  }

  componentDidMount() {
    VolunteerService.getVolunteers().then(res => {
      this.setState({ volunteers: res.data });

      console.log("volunteers: ", this.state.volunteers);
    });
  }

  render() {
    return(
      <div>
        <h1 className='text-center'>Home</h1>

        <div className = "card col-md-6 offset-md-3">
          <h3 className = "text-center"> View Volunteer Details</h3>
          <div className = "card-body">
            <div className = "row">
              <label> Volunteer Name: </label>
              <div> { this.state.volunteers.name }</div>
            </div>
            <div className = "row">
              <label> Volunteer (No. of) Years of Experience: </label>
              <div> { this.state.volunteers.experience }</div>
            </div>
          </div>

      </div>

      </div>
    );
  }
}

export default HomeComponent;
