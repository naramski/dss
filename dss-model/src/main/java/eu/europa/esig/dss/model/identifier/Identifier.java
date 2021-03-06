/**
 * DSS - Digital Signature Services
 * Copyright (C) 2015 European Commission, provided under the CEF programme
 * 
 * This file is part of the "DSS - Digital Signature Services" project.
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 */
package eu.europa.esig.dss.model.identifier;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Objects;

import eu.europa.esig.dss.enumerations.DigestAlgorithm;
import eu.europa.esig.dss.model.DSSException;
import eu.europa.esig.dss.model.Digest;

/**
 * This class is used to obtain a unique id for an object
 */
public abstract class Identifier implements Serializable {

	private static final long serialVersionUID = 1440382536669604521L;

	private static final DigestAlgorithm DIGEST_ALGO = DigestAlgorithm.SHA256;

	private final Digest id;

	private String hexValue;

	protected Identifier(byte[] data) {
		Objects.requireNonNull(data);
		this.id = new Digest(DIGEST_ALGO, getMessageDigest(DIGEST_ALGO).digest(data));
	}

	protected MessageDigest getMessageDigest(DigestAlgorithm digestAlgorithm) {
		try {
			return digestAlgorithm.getMessageDigest();
		} catch (NoSuchAlgorithmException e) {
			throw new DSSException("Unable to create a MessageDigest for algorithm " + digestAlgorithm, e);
		}
	}

	Digest getDigestId() {
		return id;
	}

	/**
	 * Return an ID conformant to XML Id
	 * 
	 * @return the XML encoded ID
	 */
	public String asXmlId() {
		if (hexValue == null) {
			hexValue = id.getHexValue();
		}
		return hexValue;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + ":" + id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (prime * result) + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Identifier other = (Identifier) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		return true;
	}

}
