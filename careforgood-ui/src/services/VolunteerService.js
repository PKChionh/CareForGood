import axios from 'axios';
import qs from 'qs';

const API_BASE_URL = "http://localhost:8080/volunteer/list";

class VolunteerService {

  getVolunteers() {
    return axios.get(API_BASE_URL, {
      params: {

      },
      paramsSerializer: result => {
        return qs.stringify(result.data);
      }
    });
  }
}

export default new VolunteerService()
