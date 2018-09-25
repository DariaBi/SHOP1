import React, {Component, Fragment} from 'react';

import Header from '../Header/Header';
import Cart from "../Cart/Cart";

class ShoppingCartPage extends Component {
    render() {
        return (
			<div style={{backgroundColor:'#FFFFFF'}}>
                <Fragment>
                    <Header/>
                    <Cart/>
                </Fragment>
            </div>
        )
    }
}

export default ShoppingCartPage;