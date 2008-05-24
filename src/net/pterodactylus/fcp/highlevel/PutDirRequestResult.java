/*
 * jFCPlib-high-level-client - PutDirRequestResult.java -
 * Copyright © 2008 David Roden
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA 02111-1307, USA.
 */

package net.pterodactylus.fcp.highlevel;

import net.pterodactylus.fcp.PersistentPutDir;
import net.pterodactylus.fcp.Priority;
import net.pterodactylus.fcp.UploadFrom;
import net.pterodactylus.fcp.Verbosity;

/**
 * A PutDir request result is generated by {@link HighLevelClient#getRequests()}.
 * 
 * @author David ‘Bombe’ Roden &lt;bombe@freenetproject.org&gt;
 */
public class PutDirRequestResult extends RequestResult {

	/** The wrapped PersistentPutDir FCP message. */
	private final PersistentPutDir persistentPutDir;

	/**
	 * Creates a new PutDir request result.
	 * 
	 * @param persistentPutDir
	 *            The PersistentPutDir FCP message to wrap
	 */
	public PutDirRequestResult(PersistentPutDir persistentPutDir) {
		super(persistentPutDir.getIdentifier());
		this.persistentPutDir = persistentPutDir;
	}

	/**
	 * Returns the number of files in the request.
	 * 
	 * @return The number of files
	 * @see net.pterodactylus.fcp.PersistentPutDir#getFileCount()
	 */
	public int getFileCount() {
		return persistentPutDir.getFileCount();
	}

	/**
	 * Returns the length of the file at the given index.
	 * 
	 * @param fileIndex
	 *            The index of the file
	 * @return The length of the file
	 * @see net.pterodactylus.fcp.PersistentPutDir#getFileDataLength(int)
	 */
	public long getFileDataLength(int fileIndex) {
		return persistentPutDir.getFileDataLength(fileIndex);
	}

	/**
	 * Returns the name of the file at the given index.
	 * 
	 * @param fileIndex
	 *            The index of the file
	 * @return The name of the file
	 * @see net.pterodactylus.fcp.PersistentPutDir#getFileFilename(int)
	 */
	public String getFileFilename(int fileIndex) {
		return persistentPutDir.getFileFilename(fileIndex);
	}

	/**
	 * Returns the content type of the file at the given index.
	 * 
	 * @param fileIndex
	 *            The index of the file
	 * @return The content type of the file
	 * @see net.pterodactylus.fcp.PersistentPutDir#getFileMetadataContentType(int)
	 */
	public String getFileMetadataContentType(int fileIndex) {
		return persistentPutDir.getFileMetadataContentType(fileIndex);
	}

	/**
	 * Returns the name of the file at the given index.
	 * 
	 * @param fileIndex
	 *            The index of the file
	 * @return The name of the file
	 * @see net.pterodactylus.fcp.PersistentPutDir#getFileName(int)
	 */
	public String getFileName(int fileIndex) {
		return persistentPutDir.getFileName(fileIndex);
	}

	/**
	 * Returns the upload source of the file at the given index.
	 * 
	 * @param fileIndex
	 *            The index of the file
	 * @return The upload source of the file
	 * @see net.pterodactylus.fcp.PersistentPutDir#getFileUploadFrom(int)
	 */
	public UploadFrom getFileUploadFrom(int fileIndex) {
		return persistentPutDir.getFileUploadFrom(fileIndex);
	}

	/**
	 * Returns the maximum number of retries for failed blocks.
	 * 
	 * @return The maximum number of retries
	 * @see net.pterodactylus.fcp.PersistentPutDir#getMaxRetries()
	 */
	public int getMaxRetries() {
		return persistentPutDir.getMaxRetries();
	}

	/**
	 * Returns the priority of the request.
	 * 
	 * @return The priority
	 * @see net.pterodactylus.fcp.PersistentPutDir#getPriority()
	 */
	public Priority getPriority() {
		return persistentPutDir.getPriority();
	}

	/**
	 * Returns the URI of the request.
	 * 
	 * @return The URI of the request
	 * @see net.pterodactylus.fcp.PersistentPutDir#getURI()
	 */
	public String getURI() {
		return persistentPutDir.getURI();
	}

	/**
	 * Returns the verbosity of the request.
	 * 
	 * @return The verbosity
	 * @see net.pterodactylus.fcp.PersistentPutDir#getVerbosity()
	 */
	public Verbosity getVerbosity() {
		return persistentPutDir.getVerbosity();
	}

	/**
	 * Returns whether the request is on the global queue.
	 * 
	 * @return <code>true</code> if the request is on the global queue,
	 *         <code>false</code> if it is on the client-local queue
	 * @see net.pterodactylus.fcp.PersistentPutDir#isGlobal()
	 */
	public boolean isGlobal() {
		return persistentPutDir.isGlobal();
	}

}