import { postJsonData, getJsonData, putJsonData, delJsonData } from "../service/restcall.js";
import configData from "../service/config.js";

const url = `${configData.baseurl}/segnalibri?page=1&size=1000`
const url2 = `${configData.baseurl}/segnalibri`

const searchBkm = () => {
    return getJsonData(url, true)
}

const searchBkmById  = (id) => {
    const fullurl = `${url2}/${id}`;
    return getJsonData(fullurl, true)
}

const doBkms = async (desc, link, shared) => {
    const BkmData = {
        descrizione:desc,
        link:link,
        condiviso:shared
    };
    return await postJsonData(url2,BkmData,true);
}

const updateBkms = async (id, desc, link, shared) =>{
    const bkmData ={
        id:id,
        descrizione:desc,
        link:link,
        condiviso:shared
    };
    return await putJsonData(url2, bkmData, true);
}

const deleteBkms = async (id) =>{
    const bkmData ={
        idSegna:id
    };
    return await delJsonData(url2, bkmData, true);
}


export {searchBkm, doBkms, updateBkms, searchBkmById, deleteBkms };
