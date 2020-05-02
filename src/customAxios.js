import axios from 'axios'; // 액시오스

function CORSPrenvtion(res){
    res.header("Access-Control-Allow-Origin", "*");
    res.send();
}

export function getPost(){
    // header를 설정하여 CORS error를 방지한다.
    return axios.get('/init', (req, res) => {
        CORSPrenvtion(res);
    });
}
