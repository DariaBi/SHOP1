import React from 'react';
import {Link} from 'react-router-dom';

import './ProductCart.css';

const ProductCart = (props) => {
    return (
        <div className="custom-row">
            <div className="custom-td">
                    <img src={`images/product/${props.image}.png`} alt=""/>
                    <p> {props.name}</p>
            </div>
            <div className="custom-td amount-product">
                <div onClick={() => props.changeAmountProduct(props.id, "ADD")}>
                    <i className="fas fa-plus"></i>
                </div>
                <p>{props.amount}</p>
                <div onClick={() => props.changeAmountProduct(props.id, "SUB")}>
                    <i className="fas fa-minus"></i>
                </div>
            </div>
            <div className="custom-td">
                <p>{props.amount}</p>
            </div>
            <div className="custom-td">
                <p>{props.allCost}</p>
                <div onClick={() => props.removeProductOfCart(props.id, true)}>
                    <img src="images/trash.png" alt=""/>
                </div>
            </div>
        </div>
    )
};


export default ProductCart;