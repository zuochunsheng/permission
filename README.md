# permission
6.0权限工具

PermissionUtil.getInstance(Context)
                    .requestRunTimePermission(new String[]{Manifest.permission.CALL_PHONE,
                                    Manifest.permission.WRITE_EXTERNAL_STORAGE},
                            new IPermission() {
                                @Override
                                public void onGranted() {
                                    Toast.makeText(Context,"所有权限都同意了",Toast.LENGTH_SHORT).show();
                                }

                                @Override
                                public void onDenied(List<String> deniedPermission) {
                                    for (String permission :deniedPermission) {
                                        Toast.makeText(Context,"被拒绝权限："  + permission,Toast.LENGTH_SHORT).show();
                                    }

                                }
                            }
                    );