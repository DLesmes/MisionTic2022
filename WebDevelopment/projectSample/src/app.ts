import express, { response } from 'express';

const app = express();
const port = 3000

app.get('/', (req, res)=>{
    res.send("prueba del servidor")
});

app.listen(port, () =>{
    return console.log(`servidor corriendo sobre el puerto ${port}`)
});