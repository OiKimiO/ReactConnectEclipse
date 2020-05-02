import React, {Component} from 'react';
import * as customAxios from './customAxios';

class App extends Component{

  constructor(){
    super();
    this.state = {
      post : {
        idtest_Table : null,
        test_name : null
      }
    }
  }  

  componentDidMount(){
    this.fetchPostInfo();
  }

  fetchPostInfo = async () => {
   /*동기 요청 */
    try{
        const info = await Promise.all([
          customAxios.getPost()
        ]); 

        console.log(info); // info의 정보를 확인      

          const {idtest_Table, test_name} = info[0].data[0]; 
          console.log(idtest_Table);
          this.setState({
            post : {
              idtest_Table,
              test_name
            }
          });

        console.log('this.state: ', this.state);
    } catch(e){
        console.log('error occured',e);
    }
    
  }

  render(){
    const {post} = this.state;

    return(
      <div id="initDiv">
        <table>
          <thead>
            <tr>
              <th>테이블 아이디</th>
              <th>테이블 이름</th>
            </tr>
          </thead>
          <tbody>
            <tr>
              <td>{post.idtest_Table}</td>
              <td>{post.test_name}</td>
            </tr>
          </tbody>          
        </table>
      </div>
    ) 
  }
}

export default App;