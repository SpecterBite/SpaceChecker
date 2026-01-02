const { contextBridge, ipcRenderer } = require("electron");

contextBridge.exposeInMainWorld("api", {
  openTextFile: () => ipcRenderer.invoke("open-text-file")
});
