// ---docerion
// type: source
// title: OperationResponse class
// summary: Java response class extending CRnK Document that carries an HTTP-style status code for operation results.
// ---

package io.crnk.operations;

import io.crnk.core.engine.document.Document;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class OperationResponse extends Document {

	private int status;


	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
}
