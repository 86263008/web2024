from sqlalchemy.orm import Session

#ORM,对象-关系：映射
from . import models, schemas

def get_user(db: Session, user_id: int):
  """
  根据id获取用户信息
  :param db: 数据库会话
  :param user_id: 用户id
  :return: 用户信息
  """
  return db.query(models.User).filter(models.User.id == user_id).first()

def get_user_by_email(db: Session, email: str):
  """
  根据email获取用户信息
  :param db: 数据库会话
  :param email: 用户email
  :return: 用户信息
  """
  return db.query(models.User).filter(models.User.email == email).first()

def get_users(db: Session, skip: int = 0, limit: int = 100):
  """
  获取特定数量的用户
  :param db: 数据库会话
  :param skip: 开始位置
  :param limit: 限制数量
  :return: 用户信息列表
  """
  return db.query(models.User).offset(skip).limit(limit).all()

def create_user(db: Session, user: schemas.UserCreate):
  """
  创建用户
  :param db: 数据库会话
  :param user: 用户模型
  :return: 根据email和password登录的用户信息
  """
  fake_hashed_password = user.password + "notreallyhashed"
  db_user = models.User(email=user.email, hashed_password=fake_hashed_password)
  db.add(db_user)      # 添加到会话
  db.commit()          # 提交到数据库
  db.refresh(db_user)  # 刷新数据库
  return db_user


def get_items(db: Session, skip: int = 0, limit: int = 100):
  """
  获取指定数量的item
  :param db: 数据库会话
  :param skip: 开始位置
  :param limit: 限制数量
  :return: item列表
  """
  return db.query(models.Item).offset(skip).limit(limit).all()


def create_user_item(db: Session, item: schemas.ItemCreate, user_id: int):
  """
  创建用户item
  :param db: 数据库会话
  :param item: Item对象
  :param user_id: 用户id
  :return: Item模型对象
  """
  db_item = models.Item(**item.dict(), owner_id=user_id)
  db.add(db_item)
  db.commit()
  db.refresh(db_item)
  return db_item