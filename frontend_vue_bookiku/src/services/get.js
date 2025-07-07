import api from './api'

export function get(path) {
  return api.get(path)
}

export function getWithParams(path, params) {
    return api.get(path, { params })
}  